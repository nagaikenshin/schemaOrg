package org.kyojo.schemaOrg.m3n3.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.pending.impl.ACTIONABLE_FEEDBACK_POLICY;
import org.kyojo.schemaOrg.m3n3.pending.Container.ActionableFeedbackPolicy;

@ExternalDomain
public class ActionableFeedbackPolicyConverter implements DomainConverter<ActionableFeedbackPolicy, String> {

	@Override
	public String fromDomainToValue(ActionableFeedbackPolicy domain) {
		return domain.getNativeValue();
	}

	@Override
	public ActionableFeedbackPolicy fromValueToDomain(String value) {
		return new ACTIONABLE_FEEDBACK_POLICY(value);
	}

}
