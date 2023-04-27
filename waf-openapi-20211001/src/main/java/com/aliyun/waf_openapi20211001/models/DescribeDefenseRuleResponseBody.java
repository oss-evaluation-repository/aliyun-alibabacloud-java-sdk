// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeDefenseRuleResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The configurations of the protection rule. The value of this parameter is a string that contains multiple parameters in the JSON format.</p>
     */
    @NameInMap("Rule")
    public DescribeDefenseRuleResponseBodyRule rule;

    public static DescribeDefenseRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDefenseRuleResponseBody self = new DescribeDefenseRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDefenseRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDefenseRuleResponseBody setRule(DescribeDefenseRuleResponseBodyRule rule) {
        this.rule = rule;
        return this;
    }
    public DescribeDefenseRuleResponseBodyRule getRule() {
        return this.rule;
    }

    public static class DescribeDefenseRuleResponseBodyRule extends TeaModel {
        /**
         * <p>The details of the protection rule. The value of this parameter is a string that contains multiple parameters in the JSON format. For more information, see the "**Protection rule parameters**" section in the [CreateDefenseRule](~~ID~~) topic.</p>
         */
        @NameInMap("Config")
        public String config;

        /**
         * <p>The origin of the protection rule. Valid values:</p>
         * <br>
         * <p>*   **custom:** The protection rule is created by the user.</p>
         * <p>*   **system:** The protection rule is automatically generated by the system.</p>
         */
        @NameInMap("DefenseOrigin")
        public String defenseOrigin;

        /**
         * <p>The scenario in which the protection rule template is used. For more information, see the description of the **DefenseScene** parameter in the [CreateDefenseRule](~~ID~~) topic.</p>
         */
        @NameInMap("DefenseScene")
        public String defenseScene;

        /**
         * <p>The most recent time when the protection rule was modified.</p>
         */
        @NameInMap("GmtModified")
        public Long gmtModified;

        /**
         * <p>The ID of the protection rule.</p>
         */
        @NameInMap("RuleId")
        public Long ruleId;

        /**
         * <p>The name of the protection rule.</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The status of the protection rule. Valid values:</p>
         * <br>
         * <p>*   **0:** disabled.</p>
         * <p>*   **1:** enabled.</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The ID of the protection rule template.</p>
         */
        @NameInMap("TemplateId")
        public Long templateId;

        public static DescribeDefenseRuleResponseBodyRule build(java.util.Map<String, ?> map) throws Exception {
            DescribeDefenseRuleResponseBodyRule self = new DescribeDefenseRuleResponseBodyRule();
            return TeaModel.build(map, self);
        }

        public DescribeDefenseRuleResponseBodyRule setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

        public DescribeDefenseRuleResponseBodyRule setDefenseOrigin(String defenseOrigin) {
            this.defenseOrigin = defenseOrigin;
            return this;
        }
        public String getDefenseOrigin() {
            return this.defenseOrigin;
        }

        public DescribeDefenseRuleResponseBodyRule setDefenseScene(String defenseScene) {
            this.defenseScene = defenseScene;
            return this;
        }
        public String getDefenseScene() {
            return this.defenseScene;
        }

        public DescribeDefenseRuleResponseBodyRule setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public DescribeDefenseRuleResponseBodyRule setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

        public DescribeDefenseRuleResponseBodyRule setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public DescribeDefenseRuleResponseBodyRule setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribeDefenseRuleResponseBodyRule setTemplateId(Long templateId) {
            this.templateId = templateId;
            return this;
        }
        public Long getTemplateId() {
            return this.templateId;
        }

    }

}
