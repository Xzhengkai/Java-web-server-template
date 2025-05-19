package ${package}.controller;

import ${package}.client.model.cqrs.qry.DemoQryListCmd;
import ${package}.client.model.cqrs.cmd.DemoInsCmd;
import ${package}.client.api.DemoAPI;
import ${package}.service.DemoService;
import ${package}.client.model.vo.DemoVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;
@Controller
public class DemoController implements DemoAPI{

    @Autowired
    DemoService demoService;
    public DemoVO insert(DemoInsCmd demoInsCmd){
        return demoService.insert(demoInsCmd);
    }
    public List<DemoVO> queryByList(DemoQryListCmd demoQryListCmd){
        return demoService.queryByList(demoQryListCmd);
    }
}
