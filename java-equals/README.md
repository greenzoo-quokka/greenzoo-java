# java-equals
자바 equals, == 비교 프로젝트

# 결과출력화면
`equals 비교는 값 비교`
```
stringA.equals(copyStringA) : true
stringA.equals(newString) : true
copyStringA.equals(newString) : true
```

`주소값 출력`
```
stringA 주소값 : 916419490
copyStringA 주소값 : 916419490
newString 주소값 : 522764626
```

`== 주소 비교`
```
stringA == copyStringA : true
stringA == newString : false
copyStringA == newString : false
```

`stringA 변경전 주소값 비교`
```
stringA 주소값 : 916419490
copyStringA 주소값 : 916419490
stringA == copyStringA : true
--------------------stringA 변경
stringA : def
copyStringA : abc
def의 주소값 : 2106620844
stringA 주소값 : 2106620844
copyStringA 주소값 : 916419490
stringA == copyStringA : false
```

`Shallow, Deep Copy`
```
array_1[0][1] 주소값 : 2006034581
array_2[0][1] 주소값 : 2006034581
array_3[0][1] 주소값 : 979294118
array_1[0][1] 값 : 100
array_2[0][1] 값 : 100
array_3[0][1] 값 : 0
```