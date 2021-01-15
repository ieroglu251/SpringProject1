package com.ticketing.implementation;

import com.ticketing.dto.RoleDTO;
import com.ticketing.entity.Role;
import com.ticketing.mapper.RoleMapper;
import com.ticketing.repository.RoleRepository;
import com.ticketing.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RoleserviceImpl implements RoleService {

    private RoleRepository roleRepository;
    private RoleMapper roleMapper;

    public RoleserviceImpl(RoleRepository roleRepository, RoleMapper roleMapper) {
        this.roleRepository = roleRepository;
        this.roleMapper = roleMapper;
    }

    @Override
    public List<RoleDTO> listAllRoles() {

        List<Role> list =roleRepository.findAll();

        //convert to dto and return it

        return list.stream().map(obj -> {return roleMapper.convertToDto(obj);}).collect(Collectors.toList());
    }

    @Override
    public RoleDTO findById(Long id) {
        Role role = roleRepository.findById(id).get();
        return roleMapper.convertToDto(role);
    }
}
