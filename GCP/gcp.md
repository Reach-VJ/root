###Commands cheat sheet :
    https://www.udemy.com/course/kubernetes-crash-course-for-java-developers/learn/lecture/16905478#overview

### Cluster : 
    is combination of worker and master nodes. 
    Nodes do the work called worker nodes. 
    Nodes do management work called master node.

### Docker Commands

**Image push to docker hub** --> $docker push bachi305/hello-world-rest-api:0.0.4-SNAPSHOT

**Login to docker hub** --> $docker login  (pass dockerid and password)

**Find docker image details** --> $docker images

**Run docker image** --> $docker run -p 8080:8080 bachi305/hello-world-rest-api:0.0.4-SNAPSHOT

### GCloud Commands

**Gcloud init** -->$gcloud init

**GCloud login** -->$gcloud auth login

**Project set** -->$gcloud config set project springdemo-287600

**Downsizing nodes**-->$gcloud container clusters resize --zone <name_of_zone> <name_of_your_cluster> --num-nodes=0
**Increasing nodes**-->$gcloud container clusters resize --zone <name_of_zone> <name_of_your_cluster> --num-nodes=3

### KubeCtl Commands
**Get pod** -->$kubectl get pods

**Create deployment** -->$kubectl create deployment hello-world-rest-api --image=in28min/hello-world-rest-api:0.0.1.RELEASE

**Expose deployment** -->$kubectl expose hello-world-rest-api --type=LoadBalancer --port=8080

**Delete Service** -->$kubectl delete service hello-world-rest-api

**Delete deployment** -->$kubectl delete deployment hello-world-rest-api

**Set to new image** -->$kubectl set image deployment hello-world-rest-api hello-world-rest-api=bachi305/hello-world-rest-api:0.0.5-SNAPSHOT

**Rollout history** -->$kubectl rollout history deployment hello-world-rest-api

**Rollout status** -->$kubectl rollout status deployment hello-world-rest-api

**Record deployment** -->$kubectl set image deployment hello-world-rest-api hello-world-rest-api=bachi305/hello-world-rest-api:0.0.5-SNAPSHOT --record

**Undo deployment** -->$kubectl rollout undo deployment hello-world-rest-api --to-revision=3

**Get pod logs** -->$kubectl logs hello-world-rest-api-6cf96d8666-4vv5t (Pod name)

**Follow pod logs** -->$kubectl logs hello-world-rest-api-6cf96d8666-4vv5t -f

**Deployment details** -->$kubectl get deployments

**Deployment details more** -->$kubectl get deployments -o wide

**Deployment detail in YAML file** -->$kubectl get deployments -o yaml

**Services details in YAML file** -->$kubectl get services -o yaml

**Create local deployment YAML file** -->$kubectl get deployments -o yaml > deployments.yaml

**Create local services YAML file** -->$kubectl get services -o yaml > services.yaml

**Apply local yaml file changes** -->$kubectl apply -f deployments.yaml

**Delete app** -->$kubectl delete all -l app=hello-world-rest-api

**Get app information** -->$kubectl get all

**Get all pods** -->$kubectl get pods --all-namespaces

**Get specific app pods** -->$kubectl get pods -l app=todo-web-application-h2

**Get sorted details on the specific field** -->$kubectl get services --all-namespace --sory-by=.spec.type

**Get cluster info** -->$kubectl cluster-info

**Scaling Replicas** -->$kubectl scale deployment todo-web-application --replicas=1

**Delete service and deployments** -->$kubectl delete -f mysql-deployment.yaml,mysql-service.yaml

**Delete configmap** -->$kubectl delete configmap todo-web-application-config

**Delete secret** -->$kubectl delete secret todo-web-application-secrets

**Get Pods Memory and CPU details** -->$kubectl top pods

**Get all events** -->$kubectl get events

### Misc Commands

**Continuous hitting url** -->$watch curl http://34.121.69.123:8080/hello-world-bean

### Config Map
**Create configMap** -->$kubectl create configmap todo-web-application-config --from-literal=RDS_DB_NAME=todos

**Details about config details** -->$kubectl describe configmap/todo-web-application-config

**Info about configMap** -->$kubectl get configmap todo-web-application-config

**Edit config map** -->$kubectl edit configmap/todo-web-application-config

**Create Secrets** -->$kubectl create secret generic todo-web-application-secrets --from-literal=RDS_PASSWORD=dummytodos

**Auto Scaling** 

Increase number of nodes --> Cluster scaling

Increase number of nodes --> Horizontal pod auto scaling

Increase resource of pods --> Vertical pod auto scaling (Increase CPU and RAM size)

## Auto Scaling

### Cluster Auto Scaling

```
gcloud container clusters create example-cluster \
--zone us-central1-a \
--node-locations us-central1-a,us-central1-b,us-central1-f \
--num-nodes 2 --enable-autoscaling --min-nodes 1 --max-nodes 4
```
### Vertical Pod Auto Scaling
- Available in version 1.14.7-gke.10 or higher and in 1.15.4-gke.15 or higher

#### Enable on Cluster

```
gcloud container clusters create [CLUSTER_NAME] --enable-vertical-pod-autoscaling --cluster-version=1.14.7
gcloud container clusters update [CLUSTER-NAME] --enable-vertical-pod-autoscaling
```

#### Configure VPA

```
apiVersion: autoscaling.k8s.io/v1
kind: VerticalPodAutoscaler
metadata:
  name: currency-exchange-vpa
spec:
  targetRef:
    apiVersion: "apps/v1"
    kind:       Deployment
    name:       currency-exchange
  updatePolicy:
    updateMode: "Off"
```

#### Get Recommendations

```
kubectl get vpa currency-exchange-vpa --output yaml
```

### Horizontal Pod Auto Scaling

```
kubectl autoscale deployment currency-exchange-service --max=3 --min=1 --cpu-percent=50
```




