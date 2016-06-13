job("code-academy-phlow-demo-review") {
  logRotator(-1, 200)
  scm {
    git {
      remote {
        name('origin')
        url('git@github.com:praqma-training/code-academy-phlow-demo.git')
        credentials('Andrey9kin')
      }
      branch('*/ready/*')
      extensions {
        cleanBeforeCheckout()
        pruneBranches()
      }
    }
  }
  triggers {
    scm('* * * * *')
  }
  wrappers {
    pretestedIntegration('SQUASHED', 'master', 'origin')
    buildName('#${BUILD_NUMBER}-${GIT_AUTHOR_NAME}')
    timestamps()
    timeout {
      absolute(15)
    }
  }
  steps {
    shell("bash test-python.sh")
    shell("bash test-c++.sh")
    shell("bash test-java.sh")
  }
  publishers {
    pretestedIntegration()
  }
}