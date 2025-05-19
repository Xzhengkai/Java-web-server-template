package ${package}.client.model.cqrs.cmd;

import lombok.Data;
/**
 * cmd  : DemoQryInsCmd
 */
@Data
public class DemoInsCmd {
    private Integer id;

    private String name;
}
