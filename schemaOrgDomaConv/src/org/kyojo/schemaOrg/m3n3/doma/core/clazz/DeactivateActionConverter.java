package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.DEACTIVATE_ACTION;
import org.kyojo.schemaOrg.m3n3.core.Clazz.DeactivateAction;

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
