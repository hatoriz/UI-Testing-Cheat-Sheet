node {
  
   stage('Source Coce Checkout') { 
        
        checkout([$class: 'GitSCM', 
                branches: [[name: '*/master']], 
                doGenerateSubmoduleConfigurations: false, 
                extensions: [[$class: 'CheckoutOption', timeout: 15]], 
                submoduleCfg: [], 
                userRemoteConfigs: 
                    [[credentialsId: 'hatorizongithub', 
                        url: 'https://github.com/hatoriz/UI-Testing-Cheat-Sheet.git']]]
        )
     }
  
    stage ('build') {
        sh ' bundle exec fastlane tests'
    }
}