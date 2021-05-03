package com.example.imagevault.ImageRepositoryPackage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Base64;

public class ImageController {

    @Autowired
    private ImageService imageService;

    @GetMapping("/photos/{id}")
    public String getImage(@PathVariable String id, Model model) {
        Image image = imageService.getImage(id);
        model.addAttribute("title", image.getTitle());
        model.addAttribute("image", Base64.getEncoder().encodeToString(image.getPic().getData()));
        return "photos";
    }

    @GetMapping("/photos/upload")
    public String uploadImage(Model model) {
        model.addAttribute("message", "hello");
        return "uploadImage";
    }

    @PostMapping("/photos/add")
    public String addImage(@RequestParam("title") String title, @RequestParam("pic") MultipartFile pic, Model model) throws IOException {
        String id = imageService.addImage(title, pic);
        return "redirect:/photos/" + id;
    }
}
