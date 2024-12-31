package com.service.server_ui.Service;

import com.service.server_ui.Models.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.Map;

@org.springframework.stereotype.Service
public interface ServerService {
    public List<Service> getAllServers();
//    public Service saveServer(Service server);
    public String deleteServer(Long id);
    public Service saveServer(Service service) throws IOException;
}
