package cn.wizzer.app.sys.modules.services.impl;

import cn.wizzer.app.sys.modules.models.Sys_app_conf;
import cn.wizzer.app.sys.modules.services.SysAppConfService;
import cn.wizzer.framework.base.service.BaseServiceImpl;
import com.alibaba.dubbo.config.annotation.Service;
import org.nutz.dao.Dao;
import org.nutz.ioc.loader.annotation.IocBean;

/**
 * Created by wizzer on 2019/2/27.
 */
@IocBean(args = {"refer:dao"})
@Service(interfaceClass = SysAppConfService.class)
public class SysAppConfServiceImpl extends BaseServiceImpl<Sys_app_conf> implements SysAppConfService {
    public SysAppConfServiceImpl(Dao dao) {
        super(dao);
    }

}