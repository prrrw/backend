package com.example.demo.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.demo.model.ExampleModel;

public class ExampleService {
    private static Map <Long, ExampleModel> images = new HashMap<>();
    private static Long index = 0L;

    public static List<ExampleModel> getAllImages() {
        return new ArrayList<>(images.values());
    }

    public static ExampleModel getImageById(Long imgId ){
        return images.get(imgId);
    }

    public static ExampleModel addImage(ExampleModel imgInfo){
        index += 1;
        imgInfo.setImgId(index);
        images.put(index, imgInfo);
        return imgInfo;
    }

    public static ExampleModel updateImg(Long imgId, ExampleModel imgInfo){
        imgInfo.setImgId(imgId);
        images.put(imgId, imgInfo);
        return imgInfo;
    }

    public static ExampleModel deleteImg(Long imgId){
        return images.remove(imgId);
    }

    public static List<ExampleModel> getDateImage(String imgDate){
        return null;
    }
}
