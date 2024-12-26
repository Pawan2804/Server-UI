package com.service.server_ui.Service;

import com.service.server_ui.Models.Service;

import java.util.List;
@org.springframework.stereotype.Service
public interface ServerService {
    public List<Service> getAllServers();
    public Service saveServer(Service server);
    public String deleteServer(Long id);
}
