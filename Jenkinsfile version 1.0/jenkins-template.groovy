import jenkins.model.Jenkins
import hudson.model.FreeStyleProject

import hudson.model.StringParameterDefinition
import hudson.model.ParametersDefinitionProperty
import hudson.model.labels.LabelExpression

FreeStyleProject job = Jenkins.	getInstance().getJob("Auto Test")

List<StringParameterDefinition> parameterDefinitions = new ArrayList<>();
parameterDefinitions.add(new StringParameterDefinition("PROJECT_KEY", "SMEFWDEMO", "test"))
parameterDefinitions.add(new StringParameterDefinition("LABEL_EXPRESSION", "master"))
parameterDefinitions.add(new StringParameterDefinition("TAG", ""))

// job.setAssignedLabel(LabelExpression.parseExpression("${LABEL_EXPRESSION}"));

ParametersDefinitionProperty paramDefProp = new ParametersDefinitionProperty(parameterDefinitions)

job.addProperty(paramDefProp)

print "${LABEL_EXPRESSION}"


