package org.kyojo.schemaOrg.m3n3.doma.core.container;

import java.util.Date;
import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.MODIFIED_TIME;
import org.kyojo.schemaOrg.m3n3.core.Container.ModifiedTime;

@ExternalDomain
public class ModifiedTimeConverter implements DomainConverter<ModifiedTime, Date> {

	@Override
	public Date fromDomainToValue(ModifiedTime domain) {
		return domain.getNativeValue();
	}

	@Override
	public ModifiedTime fromValueToDomain(Date value) {
		return new MODIFIED_TIME(value);
	}

}
