call aws ecr get-login-password --region us-east-2 | docker login --username AWS --password-stdin 593203563401.dkr.ecr.us-east-2.amazonaws.com

call aws ecr create-repository --repository-name aecs-order --image-scanning-configuration scanOnPush=true --region us-east-2


call docker build -t aecs-order .


call docker tag aecs-port:latest 593203563401.dkr.ecr.us-east-2.amazonaws.com/aecs-order :latest


call docker push 593203563401.dkr.ecr.us-east-2.amazonaws.com/aecs-order :latest




