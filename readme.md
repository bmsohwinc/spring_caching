# Summary

### To do a simple caching using Spring Boot and EHCache

- Add necessary dependencies in pom.xml
- Create an XML file ('ehcache.xml') that contains the following details:
    - _**cache name**_
    - _**key type**_
    - _**cache-value type**_
    - _**expiry time limit**_
    - _**heap space**_
- Then, cache methods that return data or interact with data
    - Add a @Cacheable
        - Provide the cache-name, and some props (a flag whether to cache or not, etc)
    - Add a @CachePut
        - Allows cache storing but does data retrieval from actual source based on the flags
    - Add a @CacheEvict
        - Allows erasing of cache based on props passed to the function
----
Reference:

[EHCache with Spring Boot](https://dimitr.im/spring-boot-cache-ehcache)  
    
