package org.example.felixlyd.ruleliteflow.service;

import org.example.felixlyd.ruleliteflow.bean.vo.EmcsReqVo;
import org.example.felixlyd.ruleliteflow.bean.vo.EmcsRespVo;

/**
 * class classname
 *
 * @author : liuyaodong
 * @date 2022/11/4
 */
public interface OutboundEmcsService {
    EmcsRespVo sleep200(EmcsReqVo emcsReqVo);
    EmcsRespVo sleep300(EmcsReqVo emcsReqVo);
    EmcsRespVo sleep400(EmcsReqVo emcsReqVo);
    EmcsRespVo sleep500(EmcsReqVo emcsReqVo);
}
