package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.STAGE;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.Stage;

@ExternalDomain
public class StageConverter implements DomainConverter<Stage, String> {

	@Override
	public String fromDomainToValue(Stage domain) {
		return domain.getNativeValue();
	}

	@Override
	public Stage fromValueToDomain(String value) {
		return new STAGE(value);
	}

}
