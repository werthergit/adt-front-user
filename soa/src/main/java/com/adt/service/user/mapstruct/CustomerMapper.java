package com.adt.service.user.mapstruct;


import com.adt.framework.common.mydao.map.BasicObjectMapper;
import com.adt.service.user.domain.RbCustomer;
import com.adt.service.user.rpc.protocol.CustomerModel;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface CustomerMapper extends BasicObjectMapper<RbCustomer, CustomerModel> {


}
