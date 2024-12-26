package com.service.server_ui.Service;

import com.service.server_ui.Models.Service;
import com.service.server_ui.Repository.ServerRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
@org.springframework.stereotype.Service
public class ServerServiceImpl implements ServerService{
    @Autowired
    public ServerRepo serverRepo;
    @Override
    public List<Service> getAllServers() {
        return serverRepo.findAll();
    }

    @Override
    public Service saveServer(Service server) {
        return serverRepo.save(server);
    }

    @Override
    public String deleteServer(Long id) {
         serverRepo.deleteById(id);
         return "server Deleted";
    }
}
