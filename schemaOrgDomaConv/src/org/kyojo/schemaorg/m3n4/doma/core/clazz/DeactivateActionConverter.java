package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.DEACTIVATE_ACTION;
import org.kyojo.schemaorg.m3n4.core.Clazz.DeactivateAction;

@ExternalDomain
public class DeactivateActionConverter implements DomainConverter<DeactivateAction, String> {

	@Override
	public String fromDomainToValue(DeactivateAction domain) {
		return domain.getNativeValue();
	}

	@Override
	public DeactivateAction fromValueToDomain(String value) {
		return new DEACTIVATE_ACTION(value);
	}

}
