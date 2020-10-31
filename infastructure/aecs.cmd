call aws cloudformation create-stack --stack-name auth --template-body file://AECS_Store_infastructure.yaml --parameters ParameterKey=ServiceName,ParameterValue=auth-service --capabilities CAPABILITY_NAMED_IAM 

call aws cloudformation create-stack --stack-name order --template-body file://AECS_Store_infastructure.yaml --parameters ParameterKey=ServiceName,ParameterValue=order-service --capabilities CAPABILITY_NAMED_IAM 

call aws cloudformation create-stack --stack-name delivery --template-body file://AECS_Store_infastructure.yaml --parameters ParameterKey=ServiceName,ParameterValue=delivery-service --capabilities CAPABILITY_NAMED_IAM 
