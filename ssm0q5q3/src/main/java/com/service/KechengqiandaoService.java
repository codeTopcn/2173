package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KechengqiandaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.KechengqiandaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.KechengqiandaoView;


/**
 * 课程签到
 *
 * @author 
 * @email 
 * @date 2022-03-06 17:45:23
 */
public interface KechengqiandaoService extends IService<KechengqiandaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KechengqiandaoVO> selectListVO(Wrapper<KechengqiandaoEntity> wrapper);
   	
   	KechengqiandaoVO selectVO(@Param("ew") Wrapper<KechengqiandaoEntity> wrapper);
   	
   	List<KechengqiandaoView> selectListView(Wrapper<KechengqiandaoEntity> wrapper);
   	
   	KechengqiandaoView selectView(@Param("ew") Wrapper<KechengqiandaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KechengqiandaoEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<KechengqiandaoEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<KechengqiandaoEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<KechengqiandaoEntity> wrapper);
}

