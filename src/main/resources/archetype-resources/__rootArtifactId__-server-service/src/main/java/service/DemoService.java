package ${package}.service;
import ${package}.client.model.cqrs.qry.DemoQryListCmd;
import ${package}.client.model.cqrs.cmd.DemoInsCmd;
import ${package}.client.model.vo.DemoVO;

import java.util.List;
/**
* @Description:
 * 命名惯例： 通常在功能名后加上Service，例如：OrderService.java。
 *
 * 使用场景：
 *
 * 。
 * 用于按照读写分离的command拆分业务逻辑的操作。
 * 特点：
 *
 * 拆分业务逻辑。
 * 提供业务操作的方法。
* @Author: kaia
*/
public interface DemoService {

//    DemoVO sayHello(DemoDTO demo);
    DemoVO insert(DemoInsCmd demoInsCmd);
    List<DemoVO> queryByList(DemoQryListCmd demoQryListCmd);
}
