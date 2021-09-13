# java-tdd-1
asd

## 특정 컬럼에 카드 추가
```
$ ${app_name} create -on ${column_name} -card ${message or card name or card body}
$ board create -on 'processing' -card 'update addresses'
```

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

> done "listen music"

board
todo - [eat food]
inprogress - 
done - [listen music]
```
