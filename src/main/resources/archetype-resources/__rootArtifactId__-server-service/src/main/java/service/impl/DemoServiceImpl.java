package ${package}.service.impl;

import ${package}.client.model.cqrs.qry.DemoQryListCmd;
import ${package}.client.model.cqrs.cmd.DemoInsCmd;
import ${package}.client.model.vo.DemoVO;
import ${package}.handler.cqrs.query.DemoQueryHandler;
import ${package}.handler.cqrs.command.DemoCommandHandler;
import ${package}.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DemoServiceImpl implements DemoService {
    @Autowired
    DemoCommandHandler demoCommandHandler;
    @Autowired
    DemoQueryHandler demoQueryHandler;


//    @Override
//    public DemoVO sayHello(DemoDTO demo){
//         //TODO
//        return null;
//     }
    @Override
    public DemoVO insert(DemoInsCmd demoInsCmd){
        //TODO
        return demoCommandHandler.insert(demoInsCmd);
    }

    /**
     * 这里后续在封Result
     * @param demoQryListCmd
     * @return
     */
    @Override
    public List<DemoVO> queryByList(DemoQryListCmd demoQryListCmd){
        //TODO
        return demoQueryHandler.queryByList(demoQryListCmd);
    }
}
