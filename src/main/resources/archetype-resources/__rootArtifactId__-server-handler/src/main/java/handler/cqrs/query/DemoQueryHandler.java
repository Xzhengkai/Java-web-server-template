package ${package}.handler.cqrs.query;

import org.springframework.stereotype.Component;
import com.zk.demo.client.model.cqrs.qry.DemoQryListCmd;
import com.zk.demo.client.model.vo.DemoVO;
import java.util.List;

@Component
public class DemoQueryHandler {


    public List<DemoVO> queryByList(DemoQryListCmd demoQryListCmd){

        return null;
    }
}
