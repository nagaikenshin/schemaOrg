package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.ACTION_ACCESSIBILITY_REQUIREMENT;
import org.kyojo.schemaorg.m3n5.core.Container.ActionAccessibilityRequirement;

@ExternalDomain
public class ActionAccessibilityRequirementConverter implements DomainConverter<ActionAccessibilityRequirement, String> {

	@Override
	public String fromDomainToValue(ActionAccessibilityRequirement domain) {
		return domain.getNativeValue();
	}

	@Override
	public ActionAccessibilityRequirement fromValueToDomain(String value) {
		return new ACTION_ACCESSIBILITY_REQUIREMENT(value);
	}

}
