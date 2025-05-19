package ${package}.client.api;
import com.zk.demo.client.model.vo.DemoVO;
import com.zk.demo.client.model.cqrs.cmd.DemoInsCmd;
import com.zk.demo.client.model.cqrs.qry.DemoQryListCmd;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;
/**
 * 服务接口
 * @author sunbo
 */
@RequestMapping("/demo")
public interface DemoAPI {

    @PostMapping("/insert")
    DemoVO insert(@RequestBody DemoInsCmd demoInsCmd);
    @GetMapping("/queryByList")
    List<DemoVO> queryByList(DemoQryListCmd demoQryListCmd);
}
