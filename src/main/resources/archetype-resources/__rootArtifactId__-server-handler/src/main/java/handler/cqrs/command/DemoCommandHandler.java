package ${package}.handler.cqrs.command;
import org.springframework.stereotype.Component;
import com.zk.demo.client.model.cqrs.cmd.DemoInsCmd;
import com.zk.demo.client.model.vo.DemoVO;
@Component
public class DemoCommandHandler {

    public DemoVO insert(DemoInsCmd demoInsCmd){
        return null;
    }
}
