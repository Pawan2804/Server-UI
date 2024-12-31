package com.service.server_ui.Service;

import com.service.server_ui.Models.Service;
import com.service.server_ui.Repository.ServerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.Map;

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
//    @Override
//public Service saveServer(String name, Map<String, String> statusLocation, MultipartFile file) throws IOException {
//    Service service = new Service();
//    service.setName(name);
//    service.setStatusLocation(statusLocation);
//
//    if (file != null) {
//        service.setImageName(file.getOriginalFilename());
//        service.setImageType(file.getContentType());
//        service.setImage(file.getBytes());
//    }
//
//    return serverRepo.save(service);
//}

    @Override
    public String deleteServer(Long id) {
         serverRepo.deleteById(id);
         return "server Deleted";
    }
}
