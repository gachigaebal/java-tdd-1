# java-tdd-1
asd

## 특정 컬럼에 카드 추가

```
$ gradle run

> add "eat food"

board
todo - [eat food]
inprogress -
done - 

> add "listen music"

board
todo - [eat food], [listen music]
inprogress -
done - 

> progress "listen music"

board
todo - [eat food]
inprogress - [listen music]
done - 

> progress "listen music"

board
todo - [eat food]
inprogress - 
done - [listen music]
```

## 회고

가람 - 문법이 어색해서 아쉽다, (성크미님의) 엄청난 리팩터링으로 우와...
성크미 - 저도.. 어.. 오랜만에 자바 만졌는데 느낌이 남아있었다. 깃헙 코 파일엇 사기다!
라스 - 빠르게 동작했다. TDD 사이클이 진행이 되었다. FP말고 OOP갔으면 좀 더 쉬웠을듯.. (자바...ㅠ)

공통 - 앞에서 동작을 명시했던게 효과적이었다.