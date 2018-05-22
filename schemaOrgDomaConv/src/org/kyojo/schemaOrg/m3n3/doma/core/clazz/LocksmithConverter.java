package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.LOCKSMITH;
import org.kyojo.schemaOrg.m3n3.core.Clazz.Locksmith;

@ExternalDomain
public class LocksmithConverter implements DomainConverter<Locksmith, String> {

	@Override
	public String fromDomainToValue(Locksmith domain) {
		return domain.getNativeValue();
	}

	@Override
	public Locksmith fromValueToDomain(String value) {
		return new LOCKSMITH(value);
	}

}
