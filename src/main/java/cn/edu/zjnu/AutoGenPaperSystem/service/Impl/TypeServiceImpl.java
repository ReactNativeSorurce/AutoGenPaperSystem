package cn.edu.zjnu.AutoGenPaperSystem.service.Impl;

import cn.edu.zjnu.AutoGenPaperSystem.model.Types;
import cn.edu.zjnu.AutoGenPaperSystem.service.TypeService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zseapeng on 2016/9/22.
 */
@Service
public class TypeServiceImpl implements TypeService {
    public int deleteByPrimaryKey(Integer typeId) {
        return 0;
    }

    public int insert(Types record) {
        return 0;
    }

    public int insertSelective(Types record) {
        return 0;
    }

    public Types selectByPrimaryKey(Integer typeId) {
        return null;
    }

    public int updateByPrimaryKeySelective(Types record) {
        return 0;
    }

    public int updateByPrimaryKey(Types record) {
        return 0;
    }

    public List<Types> selectTypesBySubjectId(Integer subjectId) {
        return null;
    }

    public List<Types> selectTypeBySubjectId(Integer subjectId) {
        return null;
    }
}
