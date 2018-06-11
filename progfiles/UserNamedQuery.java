@Entity
@Table(name = "user")
@NamedQueries({
	@NamedQuery(name = "User.findUsersLikeSearch", 
        query = "SELECT u FROM User u WHERE CONCAT(first_name, ' ', last_name) 
        	LIKE :search ") })
public class User extends BaseEntity {
	...
}