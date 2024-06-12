package com.uon.matching.model.service;

import com.uon.matching.dto.Activity;
import com.uon.matching.model.mapper.MatchingMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MatchingServiceImpl implements MatchingService {

    private final MatchingMapper matchingMapper;


    @Override
    public int insertMatchingRoom(Activity activity) {
        try {
            int isSuccess = matchingMapper.insertMatchingRoom(activity);
            return isSuccess;
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    @Override
    public int updateMatchingRoom(Activity activity) {
        try {
            int isSuccess = matchingMapper.updateMatchingRoom(activity);
            return isSuccess;
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }
}
