package com.adt.service.user.web.controller;

import com.adt.service.user.rpc.CustomerService;
import com.adt.service.user.rpc.protocol.CustomerModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping(value = "/list")
    public String toIndex(@RequestParam(value = "pageNo", defaultValue = "0") Integer pageNo, @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize, Model model) {
        List<CustomerModel> userPage = customerService.getCustomerPage(pageNo, pageSize);
        model.addAttribute("userPage", userPage);
        return "customer-list";
    }

}