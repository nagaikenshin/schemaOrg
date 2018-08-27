package org.kyojo.schemaorg.m3n4.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.pending.impl.ACTIONABLE_FEEDBACK_POLICY;
import org.kyojo.schemaorg.m3n4.pending.Container.ActionableFeedbackPolicy;

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
