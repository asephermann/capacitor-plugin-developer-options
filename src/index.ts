import { registerPlugin } from '@capacitor/core';

import type { DeveloperOptionsPlugin } from './definitions';

const DeveloperOptions = registerPlugin<DeveloperOptionsPlugin>('DeveloperOptions', {
  web: () => import('./web').then(m => new m.DeveloperOptionsWeb()),
});

export * from './definitions';
export { DeveloperOptions };
