package com.example.sml.service.Impl;

import com.example.sml.mapper.base1.LibraryMapper;
import com.example.sml.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LibraryServiceImpl implements LibraryService {
    @Autowired
    LibraryMapper libraryMapper;

    @Override
    public int totalCount() {
        return libraryMapper.totalCount();
    }
}
