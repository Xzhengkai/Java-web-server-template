package ${package}.remote.api.internal;
import com.zk.demo.client.api.DemoAPI;
//import org.springframework.cloud.openfeign.FeignClient;
/**
 * 远程调用
 * @author sunbo
 */
//@FeignClient(contextId = ${artifactId}, name = "${provider.base-biz-server.name}", path = "${provider.base-biz-server.context-path}")
public interface DemoRemoteAPI extends DemoAPI{

}
