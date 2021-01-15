package com.ticketing.implementation;

import com.ticketing.dto.ProjectDTO;
import com.ticketing.entity.Project;
import com.ticketing.enums.Status;
import com.ticketing.mapper.ProjectMapper;
import com.ticketing.mapper.UserMapper;
import com.ticketing.repository.ProjectRepository;
import com.ticketing.service.ProjectService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProjectServiceImpl implements ProjectService {

    private ProjectMapper projectMapper;
    private ProjectRepository projectRepository;
    private UserMapper userMapper;

    public ProjectServiceImpl(ProjectMapper projectMapper, ProjectRepository projectRepository, UserMapper userMapper) {
        this.projectMapper = projectMapper;
        this.projectRepository = projectRepository;
        this.userMapper = userMapper;
    }

    @Override
    public ProjectDTO getByProjectCode(String code) {
        return null;
    }

    @Override
    public List<ProjectDTO> listAllProjects() {

        List<Project> list = projectRepository.findAll();
        return list.stream().map(obj -> projectMapper.convertToDto(obj)).collect(Collectors.toList());
    }

    @Override
    public Project save(ProjectDTO dto) {

        dto.setProjectStatus(Status.OPEN);
        Project obj = projectMapper.convertToEntity(dto);
        Project project= projectRepository.save(obj);
        return project;
    }

    @Override
    public void update(ProjectDTO dto) {

    }

    @Override
    public void delete(String code) {

    }

    @Override
    public void complete(String projectCode) {

    }

    @Override
    public List<ProjectDTO> listAllProjectDetails() {
        return null;
    }
}
