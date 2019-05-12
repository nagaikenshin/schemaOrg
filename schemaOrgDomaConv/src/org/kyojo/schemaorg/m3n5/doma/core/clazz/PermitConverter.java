package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.PERMIT;
import org.kyojo.schemaorg.m3n5.core.Clazz.Permit;

@ExternalDomain
public class PermitConverter implements DomainConverter<Permit, String> {

	@Override
	public String fromDomainToValue(Permit domain) {
		return domain.getNativeValue();
	}

	@Override
	public Permit fromValueToDomain(String value) {
		return new PERMIT(value);
	}

}
