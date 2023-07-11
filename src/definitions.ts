export interface DeveloperOptionsPlugin {
  isDevelopmentSettingsEnabled(): Promise<{ value: boolean }>;
  openDeveloperOptions(): Promise<void>;
}
