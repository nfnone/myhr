spring web spring security mysql driver mybatis frameword



逆向工程

mapperscaner



```
<build>
        <resources>
            <resource>
                <directory>src/main/resource</directory>
            </resource>
            <resource>
                <directory>src/main/java</directory>
                <includes>
                    <include>**/*.xml</include>
                </includes>
            </resource>
        </resources>
```



```
public class Hr implements UserDetails {
```



```
@Service
public class UserService implements UserDetailsService {
    @Autowired
    HrMapper hrMapper;
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return null;
    }
}
```



```
  <select id="loadUserByUsername" resultMap="BaseResultMap" parameterType="java.lang.String">
    select * from hr where username=#{username}
  </select>
```





securityConfig



respbean