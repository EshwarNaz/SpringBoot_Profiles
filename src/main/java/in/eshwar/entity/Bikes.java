package in.eshwar.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Bikes {
	@Id
	private Integer bike_id;
	private String bike_name;

}
