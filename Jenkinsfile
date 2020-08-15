def network='jenkins-${BUILD_NUMBER}'
def seleniumHub='selenium-hub-${BUILD_NUMBER}'
def chrome='chrome-${BUILD_NUMBER}'
def firefox='firefox-${BUILD_NUMBER}'
def containertest='conatinertest-${BUILD_NUMBER}'
  def MODL='cucumber.api.cli.Main --glue "StepDefinitions" classpath:Features' 
pipeline {
  
        agent {
                any {
                    image 'maven:3-alpine'
                    args '-v $HOME/.m2:/root/.m2'
                }
            }
   

   stages{
      stage('Setting Up Selenium Grid') {
         steps{      
         
         //docker run -d -P -p 5900:5900 --link selenium-hub:hub selenium/node-chrome-debug:3.141.59-yttrium
         //docker run -d -P -p 5901:5900 --link selenium-hub:hub selenium/node-firefox-debug:3.141.59-yttrium  
          //  sh "docker network create ${network}"
         //   sh "docker run -d -p 4444:4444 --name ${seleniumHub} --network ${network} selenium/hub"
           // sh "docker run -d -e HUB_PORT_4444_TCP_ADDR=${seleniumHub} -e HUB_PORT_4444_TCP_PORT=4444 --network ${network} --name ${chrome} -p 5900:32768 selenium/node-chrome-debug:3.141.59-yttrium"
         //sh "docker run -d -e HUB_PORT_4444_TCP_ADDR=${seleniumHub} -e HUB_PORT_4444_TCP_PORT=4444 --network ${network} --name ${firefox} -p 5901:32769 selenium/node-firefox-debug"
        //sh "docker run -d --rm -i --name zalenium -p 4444:4444  -v /var/run/docker.sock:/var/run/docker.sock -v /tmp/videos:/home/seluser/videos --privileged dosel/zalenium start"
                //sleep(time:80,unit:"SECONDS") 
                
                //sh "docker run -d -P -p 4444:4444 --name ${seleniumHub} selenium/hub"
              // sh  "docker run -d -P  -p 5900:5900 --link ${seleniumHub}:hub  --name ${chrome} selenium/node-chrome-debug:3.141.59-yttrium"
              //  sh "docker-compose up"
              sh "pwd"
        
         }
      }
	stage('Build Jar') {
	
	 
            
           
            steps {
                sh 'sudo mvn clean package -DskipTests -Dmaven.clean.failOnError=false'
            }
        }
        stage('Build Image') {
            steps {
                script {
                      // vinsdocker/containertest => organization/application - it could be anything
                  app = docker.build("vagrant/containertest")
					 sh "pwd"
                }
            }
        }
      stage('Run Test') {
         steps{
           
                  // a directory 'search' is created for container test-output
                 // sh "docker run --rm -e SELENIUM_HUB=${seleniumHub} -e BROWSER=chrome  -v ${WORKSPACE}/target:/usr/share/suman/ --network ${network} vagrant/containertest"
                //sh "docker run --rm -e SELENIUM_HUB=${seleniumHub} -e BROWSER=chrome  -v ${WORKSPACE}/target:/usr/share/suman/ vagrant/containertest"
                  //archive all the files under 'search' directory
                  
                //  sh "docker-compose up"
                  sh "pwd"
                    sh "docker-compose up"
          
                  
                  archiveArtifacts artifacts: 'target/**', fingerprint: true
            
                            
            
         }
      }
      stage('Tearing Down Selenium Grid') {
          steps {
             //remove all the containers and volumes
             sh "docker rm -vf ${chrome}"
           // sh "docker rm -vf ${firefox}"
        sh "docker rm -vf ${seleniumHub}"
            // sh "docker network rm ${network}"
          //  sh 'docker stop zalenium'
          }
        }   
   }
}