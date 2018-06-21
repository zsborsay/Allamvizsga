@Repository
public interface UserRepository extends CrudRepository<User, Long> {
  Iterable<User> findUsersLikeSearch(@Param("search") String search) 
    		throws RepositoryException;	
	...
}