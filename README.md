# team20_week5

Guideline
—————
First, after creating the the **BillView**[^stakedit] object in **Main**[^stakedit] class, running **printAll** method.
**printAll** method of **BillView** outputs the information of the **customerInfo**, **minutesUsed** and **expectedBill**.
**expectedBill** information is generated the object(billCalculated) of **BillCalculator**[^stakedit] class, it runs the **calculateExpectedBill** method.
**calculateExpectedBill** method is to bring information from the **Customer**[^stakedit] Class.
**Plan**[^stakedit] of **Customer** Class is received in **InputClass**[^stakedit] Information determined as the basic.
After import the **basicMontlyRate** value according to the **Plan**, **expectedBill** is determined by using values of the number of **lines** and **minutesUsed**.
After object of **Address**[^stakedit] class, in **customerInfo** object, is generated, it received by information of country, city and address. **minutesUsed** received the information is taken from **InputClass**.
Finally, values of **minutesUsed** and **customerInfo** are printed. **Plan** , number of **lines** and used time are calculated and the value of **expectedBill** is printed.

>**Note:**

> -BillView Class : This class prints User information, used time, and cost print.
> -Main Class : This class is print all User information.
> -BillCalculator Class : This class calculates each conditions of plan.
> -Plan Class : This class is abstract class. It is extended Gold and Silver.
> -Customer Class : This class generate object of InputClass. It is inputed number of lines, used time, type of plan. it generates object of address class and is inputed user address.
> -InputClass Class : This class is inputed type of plan, used time, number of lines. 
> -Address Class : This class is inputed user address.

-----------------------------------------------------------------------------------------------------------------
Test 실행
1.address객체를 생성하여 임의의 사용자정보 입력

2.input 객체들을 배열로 생성하여 silver,gold 타입의 4가지 경우를 입력
    1)Silver이면서 사용량이 기본값을 넘고 라인 수가 4인 경우
    2)Gold이면서 사용량이 기본값을 넘고 라인 수가 3인 경우
    3)Silver면서 사용량이 기본값을 넘지 않고 라인 수가 1인경우
    4)goid이면서 사용량이 기본값을 넘지 않고 라인 수가 1인경우 

3.생성된 input 객체의 정보와 address객체의 정보를 customer와 billview 객체 생성시 입력해주고
  모두 출력