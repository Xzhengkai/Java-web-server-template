package ${package}.client.model.cqrs.qry;

import lombok.Data;
/**
 * cmd  : DemoQryListCmd
 */
@Data
public class DemoQryListCmd {
    private Integer id;

    private String name;
}
