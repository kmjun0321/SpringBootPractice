# SpringBootPractice

2023.12.11
> testTotalPoliciesList 출력 성공함


2023.12.17
> getTotalPoliciesList 출력 성공
>
> 처음에 application.properties에서 *spring.jpa.hibernate.ddl-auto=create* 으로 지정하여 테이블이 날아감
>
> *spring.jpa.hibernate.ddl-auto=update* 으로 변경
>
> application.properties 에 TotalPolicies가 total_policies 테이블로 생성되어 언더바 자동변경 방지 코드 추가.

2023.12.19
> Insert 추가
>
> RegDate, LastModifyDate는 *String* 타입으로 받고, Insert 될 때 _TotalPoliciesServiceImpl_ 에서 적용해줌.