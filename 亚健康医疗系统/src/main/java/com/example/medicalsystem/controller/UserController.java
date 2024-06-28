package com.example.medicalsystem.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.medicalsystem.pojo.ResultVo;
import com.example.medicalsystem.pojo.User;
import com.example.medicalsystem.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/users")
public class UserController {

    // 注入UserService
    @Resource
    private UserService userService;

    @GetMapping("/all")
    public List<User> getAllUsers() {
        return userService.list(); // This assumes UserService has a method to fetch all users
    }

    @PostMapping("/add")
    public ResultVo addUser(@RequestBody User user) {
        ResultVo resultVo = new ResultVo();
        boolean saved = userService.save(user);
        if (saved) {
            resultVo.setCode(200);
            resultVo.setMsg("新增用户成功");
        } else {
            resultVo.setCode(500);
            resultVo.setMsg("新增用户失败");
        }
        return resultVo;
    }

    // 更新用户信息
    @PutMapping("/update")
    public ResultVo updateUser(@RequestBody User user) {
        ResultVo resultVo = new ResultVo();
        boolean updated = userService.updateById(user);
        if (updated) {
            resultVo.setCode(200);
            resultVo.setMsg("更新用户信息成功");
        } else {
            resultVo.setCode(500);
            resultVo.setMsg("更新用户信息失败");
        }
        return resultVo;
    }

    // 删除用户
    @DeleteMapping("/delete/{id}")
    public ResultVo deleteUser(@PathVariable Long id) {
        ResultVo resultVo = new ResultVo();
        boolean removed = userService.removeById(id);
        if (removed) {
            resultVo.setCode(200);
            resultVo.setMsg("删除用户成功");
        } else {
            resultVo.setCode(500);
            resultVo.setMsg("删除用户失败");
        }
        return resultVo;
    }
    // 登录


    // 根据用户名查询用户信息
    @GetMapping("/username/{username}")
    public User getUserByUsername(@PathVariable String username) {
        return userService.getOne(new QueryWrapper<User>().eq("username", username));
    }


    @PutMapping("/username/{username}")
    public ResultVo updateUserByUsername(@PathVariable String username, @RequestBody User updatedUser) {
        ResultVo resultVo = new ResultVo();

        // 查询要修改的用户信息
        User userToUpdate = userService.getOne(new QueryWrapper<User>().eq("username", username));

        if (userToUpdate == null) {
            resultVo.setCode(404);
            resultVo.setMsg("用户不存在");
            return resultVo;
        }

        // 更新用户信息
        userToUpdate.setPassword(updatedUser.getPassword());
        userToUpdate.setAge(updatedUser.getAge());
        userToUpdate.setGender(updatedUser.getGender());
        userToUpdate.setBloodPressure(updatedUser.getBloodPressure());
        userToUpdate.setLungCapacity(updatedUser.getLungCapacity());
        userToUpdate.setRole(userToUpdate.getRole());

        boolean updated = userService.updateById(userToUpdate);
        if (updated) {
            resultVo.setCode(200);
            resultVo.setMsg("用户信息更新成功");
        } else {
            resultVo.setCode(500);
            resultVo.setMsg("用户信息更新失败");
        }

        return resultVo;
    }


    @PostMapping("/login")
    public ResultVo login(@RequestParam String username, @RequestParam String password) {
        ResultVo resultVo = new ResultVo();
        User user = userService.getOne(
                new QueryWrapper<User>().eq("username", username).eq("password", password)
        );
        if (user==null){
            resultVo.setMsg("0");
            return resultVo ;
        }
        // 获取用户角色
        String role = user.getRole();
        if (role.equals("管理员")){
            resultVo.setMsg("1");
        }
        // 如果是患者，设置消息为2
        if (role.equals("用户")){
            resultVo.setMsg("2");
        }
        // 设置数据为用户名
        resultVo.setData(username);
        // 设置代码为200
        resultVo.setCode(200);
        // 返回ResultVo
        return resultVo;
    }



}

